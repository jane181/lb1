import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.FileInputStream;
import java.io.IOException;

//import java.io.*;

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

        //String input = fileToString(input_path); // get the input
        CharStream in = CharStreams.fromString(str); // 获取输入流
         //用 in 构造词法分析器 lexer，词法分析的作用是产生记号
        lb1Lexer lexer = new lb1Lexer(in);
 
        CommonTokenStream tokenStream = new CommonTokenStream(lexer); // 词法分析获取 token 流
      

            //再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
        lb1Parser parser = new lb1Parser(tokenStream);
       
       // CommonTokenStream tokenStream = new CommonTokenStream(lexer); // 词法分析获取 token 流
      
        parser.removeErrorListeners();
        parser.addErrorListener(e);
        ParseTree tree = parser.compUnit(); // 获取语法树的根节点
        Visitor visitor = new Visitor();
        visitor.visit(tree);
          file.close();
    }

//     public static String fileToString(String fileName) {
//         try {
//             BufferedReader reader = new BufferedReader(new FileReader(fileName));
//             StringBuilder stringBuilder = new StringBuilder();
//             char[] buffer = new char[10];
//             while (reader.read(buffer) != -1) {
//                 stringBuilder.append(new String(buffer));
//                 buffer = new char[1];
//             }
//             reader.close();
//             return stringBuilder.toString();
//         }
//         catch (Exception e) {
//             System.out.println(e);
//         }
//         return "";
//     }
}
