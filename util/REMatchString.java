//public Matcher appendReplacement(StringBuffer sb, String replacement)
//public StringBuffer appendTail(StringBuffer sb)
//public String replaceAll(String replacement)
//public String replaceFirst(String replacement)

String str = "<font color=\"red\">Hello</font>";
Pattern pat1 = Pattern.compile(
	"<(\\w)+[\\s\\w=\"]+>[\\w]+</([\\w]+)>");
Pattern pat2 = Pattern.compile("<");
Pattern pat3 = Pattern.compile(">");

Matcher mat1 = pat1.matcher(str);
while(mat1.find()){
  System.out.println("THIS" + mat1.group(1) + " TAG ");
}
System.out.println("ESCAPE");
Matcher mat2 = pat2.matcher(str);
Matcher mat3 = pat3.matcher(mat2.replaceAll("&lt;"));
System.out.println("&gt;");


