import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Visitor extends lab1BaseVisitor<Void> {
    public PrintStream ps = new PrintStream(new FileOutputStream(main.outputPath));
    public static String exp = "";

    public Visitor() throws FileNotFoundException {
        System.setOut(ps);
    }

    @Override
    public Void visitCompUnit(lab1Parser.CompUnitContext ctx) {
        return super.visitCompUnit(ctx);
    }

    @Override
    public Void visitFuncDef(lab1Parser.FuncDefContext ctx) {
        System.out.print("define dso_local ");
        return super.visitFuncDef(ctx);
    }

    @Override
    public Void visitFuncType(lab1Parser.FuncTypeContext ctx) {
        System.out.print("i32 ");
        return null;
    }

    @Override
    public Void visitIdent(lab1Parser.IdentContext ctx) {
        System.out.print("@main() ");
        return null;
    }

    @Override
    public Void visitBlock(lab1Parser.BlockContext ctx) {
        System.out.println("{");
        visit(ctx.stmt());
        System.out.println("}");
        return null;
    }

    @Override
    public Void visitStmt(lab1Parser.StmtContext ctx) {
        visit(ctx.exp());
        System.out.print("    ret i32 ");
      //  new PostfixExpression().func(exp);
        return null;
    }

    @Override
    public Void visitExp(lab1Parser.ExpContext ctx) {
        return super.visitExp(ctx);
    }

    @Override
    public Void visitAddExp(lab1Parser.AddExpContext ctx) {
        return super.visitAddExp(ctx);
    }

    @Override
    public Void visitAddSub(lab1Parser.AddSubContext ctx) {
        exp += ctx.getText();
        return super.visitAddSub(ctx);
    }

    @Override
    public Void visitMulExp(lab1Parser.MulExpContext ctx) {
        return super.visitMulExp(ctx);
    }

    @Override
    public Void visitMulDiv(lab1Parser.MulDivContext ctx) {
        exp += ctx.getText();
        return super.visitMulDiv(ctx);
    }

    @Override
    public Void visitUnaryExp(lab1Parser.UnaryExpContext ctx) {
        return super.visitUnaryExp(ctx);
    }

    @Override
    public Void visitPrimaryExp(lab1Parser.PrimaryExpContext ctx) {
        if (ctx.number() != null) {
            visit(ctx.number());
        } else {
            exp += "(";
            visit(ctx.exp());
            exp += ")";
        }
        return null;
    }

    @Override
    public Void visitUnaryOp(lab1Parser.UnaryOpContext ctx) {
        exp += ctx.getText();
        return super.visitUnaryOp(ctx);
    }

    @Override
    public Void visitNumber(lab1Parser.NumberContext ctx) {
        if (ctx.DecimalConst() != null) {
            exp += ctx.DecimalConst().getText();
        } else if (ctx.OctalConst() != null) {
            String s = ctx.OctalConst().getText().substring(1);
            exp += String.valueOf(Integer.parseInt(s, 8));
        } else {
            String s = ctx.HexadecimalConst().getText().substring(2);
            exp += String.valueOf(Integer.parseInt(s, 16));
        }
        return null;
    }
}
