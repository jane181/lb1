import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;

public class main {
    public static String outputPath = "";

    public static void main(String[] args) throws IOException {
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
       PrintStream ps = null;
//        File file = new File(args[1]);
//
//        try {
        ps = new PrintStream(new FileOutputStream(outputPath));
    
        CharStream inputStream = CharStreams.fromString(str); // 获取输入流
        lab1Lexer lexer = new lab1Lexer(inputStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(e);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer); // 词法分析获取 token 流
        lab1Parser parser = new lab1Parser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(e);

        ParseTree tree = parser.compUnit(); // 获取语法树的根节点
        // System.out.println(tree.toStringTree(parser)); // 打印字符串形式的语法树

        Visitor visitor = new Visitor();
        visitor.visit(tree);

        file.close();
    }
}
