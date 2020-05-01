package org.module.hello;

public class ModuleMain{
    public static void main(String... args) {
        String adj = args.length > 0 ? (" " + args[0]) : "";
        System.out.println(leftPad("Hello,"+adj+ " world!", 90));
    }

    private static String leftPad(String s,int w){
        StringBuilder sb = new StringBuilder();
        int n = w - s.length();
        for(int i=0;i<n;i++)
            sb.append(" ");
        sb.append(s);
        return sb.toString();
    }
}