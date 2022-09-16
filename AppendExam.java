public class AppendExam {
    public static void main(String args[]){
        StringBuffer sb1 = new StringBuffer(" Java Programing");
        StringBuffer sb2 = new StringBuffer(" Project");
        StringBuffer str1 = null;
        StringBuffer str2 = null;

        str1 = sb1.append(" Project"); // sb1/str1 => Java Programing Project
        str2 = sb1.append(sb2);   // sb1/str2 => Java Programing Project Project
        System.out.println("sb1 = "+sb1); //Java Programing Project Project
        System.out.println("sb2 = "+sb2); // Project
        System.out.println("str1 = "+str1); //Java Programing Project Project
        System.out.println("str2 = "+str2); //Java Programing Project Project
    }
}
