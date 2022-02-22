import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;

public class main {
public static String outputPath="";
public static String inputPath="";
    public static void main(String[] args) {
        ErrorListener e = new ErrorListener();
        inputPath = args[0];
        outputPath = args[1];
        
        
        File file = new File(outputPath);
       
        PrintStream ps = null;
        String input = fileToString(inputPath); // get the input
        try {
            ps = new PrintStream(file);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        System.setOut(ps);
        
      
        CharStream inputStream = CharStreams.fromString(input); // 获取输入流
       lb1Lexer lexer = new lb1Lexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer); // 词法分析获取 token 流
         lb1Parser parser = new lb1Parser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(e);
        ParseTree tree = parser.compUnit(); // 获取语法树的根节点
        visitor visitor = new visitor();
        visitor.visit(tree);
    }

    public static String fileToString(String fileName) {
      
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
StringBuilder stringBuilder = new StringBuilder();
char[] buffer = new char[10];
while (reader.read(buffer) != -1) {
    stringBuilder.append(new String(buffer));
    buffer = new char[10];
}
reader.close();

            return stringBuilder.toString();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
