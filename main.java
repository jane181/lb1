import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class main {
public static String outputPath="";
public static String inputPath="";
    public static void main(String[] args) throws IOException {
        outputPath = args[1];
        inputPath = args[0];
        ErrorListener e = new ErrorListener();

        FileOutputStream file = new FileOutputStream(outputPath);

//       PrintStream f = null;
//        try {
//            f= new PrintStream(file);
//        } catch (FileNotFoundException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        }
       System.setOut(new PrintStream(file));


        String str = useBufread(inputPath);
        CharStream inputStream = CharStreams.fromString(str); // 获取输入流
        lb1Lexer lexer = new lb1Lexer(inputStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(e);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer); // 词法分析获取 token 流
        lb1Parser parser = new lb1Parser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(e);

        ParseTree tree = parser.compUnit(); // 获取语法树的根节点

        visitor visitor = new visitor();
        visitor.visit(tree);

        file.close();
    }
    public static String useBufread(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder stringBuilder = new StringBuilder();
            String line = null;
            String ls = System.getProperty("line.separator");
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            reader.close();
            return stringBuilder.toString();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
