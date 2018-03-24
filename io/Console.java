//char[] radPasswrod([String fmt, Object ... args])

Console console = System.consle();

char[] password = console.readPassword();
System.out.println(password);

password = console.readPassword("[%tT]password>", new Date());
for(char c : password){
  console.printf("%c", c);
}


