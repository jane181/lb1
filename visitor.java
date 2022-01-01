
public class visitor extends lb1BaseVisitor<Void> {
    // public PrintStream ps = new PrintStream(new FileOutputStream(main.output_path));
    public static String exp = "";

//    public visitor() throws FileNotFoundException {
//        System.out.print("lllll ");
//    }

    @Override
    public Void visitCompUnit(lb1Parser.CompUnitContext ctx) {
        return super.visitCompUnit(ctx);
    }

    @Override
    public Void visitFuncDef(lb1Parser.FuncDefContext ctx) {
        System.out.print("define dso_local ");
        return super.visitFuncDef(ctx);
    }

    @Override
    public Void visitFuncType(lb1Parser.FuncTypeContext ctx) {
        System.out.print("i32 ");
        return null;
    }

    @Override
    public Void visitIdent(lb1Parser.IdentContext ctx) {
        System.out.print("@main() ");
        return null;
    }

    @Override
    public Void visitBlock(lb1Parser.BlockContext ctx) {
        System.out.println("{");
        visit(ctx.stmt());
        System.out.println("}");
        return null;
    }

    @Override
    public Void visitStmt(lb1Parser.StmtContext ctx) {
        System.out.print("  ret ");
        // visit(ctx.number());
//       new PostfixExpression().func(exp);
        //return null;
        return super.visitStmt(ctx);
    }

     @Override
    public Void visitNumber(lb1Parser.NumberContext ctx) {
        int number = 0;
        if (ctx.decimalconst() != null) {
            number = Integer.parseInt(ctx.decimalconst().toString());
        } else if (ctx.octalconst() != null) {
            String oct = ctx.octalconst().toString();
            number = Integer.valueOf(oct, 8);
        } else {
            String hex = ctx.hexadecimalconst().toString().substring(2);
            number =Integer.valueOf(hex, 16);
        }
        System.out.print(number);
        return super.visitNumber(ctx);
    }

    @Override
    public Void visitDecimalconst(lb1Parser.DecimalconstContext ctx) {
        return super.visitDecimalconst(ctx);
    }

    @Override
    public Void visitOctalconst(lb1Parser.OctalconstContext ctx) {
        return super.visitOctalconst(ctx);
    }

    @Override
    public Void visitHexadecimalconst(lb1Parser.HexadecimalconstContext ctx) {
        return super.visitHexadecimalconst(ctx);
    }

    @Override
    public Void visitHexadecimalprefix(lb1Parser.HexadecimalprefixContext ctx) {
        return super.visitHexadecimalprefix(ctx);
    }

    @Override
    public Void visitNonzerodigit(lb1Parser.NonzerodigitContext ctx) {
        return super.visitNonzerodigit(ctx);
    }

    @Override
    public Void visitOctaldigit(lb1Parser.OctaldigitContext ctx) {
        return super.visitOctaldigit(ctx);
    }

    @Override
    public Void visitDigit(lb1Parser.DigitContext ctx) {
        return super.visitDigit(ctx);
    }

    @Override
    public Void visitHexadecimaldigit(lb1Parser.HexadecimaldigitContext ctx) {
        return super.visitHexadecimaldigit(ctx);
    }
}


