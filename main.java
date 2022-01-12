import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
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
       PrintStream ps = null;

        ps = new PrintStream(new FileOutputStream(outputPath));

        //对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
        CharStream in = CharStreams.fromString(str);
        ;

        //用 in 构造词法分析器 lexer，词法分析的作用是产生记号
        lb1Lexer lexer = new lb1Lexer(in);

        //final Listener listener = new Listener(ref);
        lexer.removeErrorListeners();

        lexer.addErrorListener(e);

        //用词法分析器 lexer 构造一个记号流 tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
        lb1Parser parser = new lb1Parser(tokens);
       parser.removeErrorListeners();

        parser.addErrorListener(e);

        //最终调用语法分析器的规则 prog，完成对表达式的验证
        //parser.prog();
        ParseTree tree = parser.compUnit(); // 获取语法树的根节点

        visitor visitor = new visitor();
        visitor.visit(tree);
         file.close();
    }
}
