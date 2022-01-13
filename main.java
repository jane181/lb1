import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class main {

    public static void main(String[] args) throws IOException {
            ErrorListener e = new ErrorListener();
            FileInputStream file = new FileInputStream(args[0]);
            String outputPath = "";
            outputPath = args[1];

            byte[] arr = new byte[100];
            String str = "";
            int i = 0;

            while ((i = file.read(arr, 0, 100)) != -1) {
                str += new String(arr, 0, i);
            }
       
    
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
}
