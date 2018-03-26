//public int offsetByCodePoints(int index, int codePointOffset)

String str = "";
StringBuilder sb = new StirngBuilder(str);

for(int i = 0; i < sb.offsetByCodePoints(0, 5);
  i = sb.offsetByCodePoints(i, 1)){
  int codepoint = str.codePointAt(i);
  System.out.printf("%c [u+%h]%n", codepoint, codepoint);
}

//public int codePointAt(int index)
//public int codePointBefore(int index)

String str = "";

StringBuilder sb = new StringBuilder(str);
StringBuilder sbf = new StringBuffer(str);

int codepoint = sb.codePointAt(6);
System.out.printf("%c [u+%h]", codepoint, codepoint);
SBCodepoint.printHex(Character.toChars(codepoint));
System.out.println();

codepoint = sbf.codePointBefore(4);
System.out.printf("%c [u+%h]", codepoint, codepoint);
SBCodepoint.printHex(Character.toChars(codepoint));
System.out.println();

