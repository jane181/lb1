import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;

public class main {
    public static void main(String[] args) {
        ErrorListener e = new ErrorListener();
        String input_path = args[0];
        String output_path = args[1];

        // 输出重定向到目标文件
        File file = new File(output_path);
        PrintStream stream = null;
        try {
            stream = new PrintStream(file);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        System.setOut(stream);

        String input = fileToString(input_path); // get the input
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
            try {
           FileInputStream fis = null;
        byte[] buffer = new byte[10];
        StringBuilder sb = new StringBuilder();
        try {
            fis = new FileInputStream(fileName);

            while (fis.read(buffer) != -1) {
                sb.append(new String(buffer));
                buffer = new byte[10];
            }
            fis.close();

            return stringBuilder.toString();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
