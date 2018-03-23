//public boolean matches()
//public boolean find([int start])
//public boolean lookinAt()
//public int start([int group])
//public int end([int group])

String html = "<font color=\"red"\>Hello</font>";

Pattern pattern = Pattern.compile(
  "<\\2\\s/-\">+>");
Matcher matcher = pattern.matcher(html);
System.out.println("matcher.matches():" + matcher.matches());
System.out.println("matcher.lookingAt():" + matcher.lookingAt()
	+ "" + matcher.start()
	+ "" + matcher.end()
	+ "" + matcher.group() + ")");
System.out.println("matcher.find():" + matcher.find()
	+ "" + matcher.start()
	+ "" + matcher.end()
	+ "" + matcher.group() + ")");


