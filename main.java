import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class main {
    //public static String output_path = "";

    public static void main(String[] args) {
        ANTLRErrorListener e = new ErrorListener();
                String input_path = args[0];
                String output_path = args[1];

        File file = new File(output_path);
                PrintStream ps = null;
                try {
                        ps = new PrintStream(file);
                    } catch (FileNotFoundException fileNotFoundException) {
                        fileNotFoundException.printStackTrace();
                    }
                System.setOut(ps);
            String str = fileToString( args[0]);
            //对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
            CharStream in = CharStreams.fromString(str);;

            //用 in 构造词法分析器 lexer，词法分析的作用是产生记号
            lb1Lexer lexer = new lb1Lexer(in);

            //final Listener listener = new Listener(ref);
            lexer.removeErrorListeners();

            lexer.addErrorListener(new BaseErrorListener());

            //用词法分析器 lexer 构造一个记号流 tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            //再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
            lb1Parser parser = new lb1Parser(tokens);

            parser.removeErrorListeners();

            parser.addErrorListener(new BaseErrorListener());

            //最终调用语法分析器的规则 prog，完成对表达式的验证
            //parser.prog();
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
                                buffer = new char[1];
                            }
                        reader.close();
                        return stringBuilder.toString();
                    }
                catch (Exception e) {
                        System.out.println(e);
                    }
                return "";
            }

}