//public int offsetByCodePoints(int index, int codePointOffset)

String str = "";

for(int i = 0; i < str.offsetByCodePoints(0, 5);
  i = str.offsetByCodePoints(i, 1)){
  int codepoint = str.codePointAt(i);
  System.out.printf("%c [u+%h]%n", codepoint, codepoint);
  }

//public int codePointAt(int index)
//public int codePointBefore(int index)

static void printHex(char[] cs){
  for(char c : cs){
    System.out.printf("0x%H", (int)c);
  }
}

public static void main(String[] args){
  String str = "";

  int codepoint = str.codePointAt(6);
  System.out.printf("%c [u+%h]", codepoint, codepoint);
  STCodepointSample1.printHex(Character.toChars(codepoint));
  System.out.println();

  codepoint = str.codePointBefore(4);
  System.out.printf("%c [u+%h]", codepoint, codepoint);
  STCodepointSample1.printHex(Character.toChars(codepoint));
  System.out.println();
}


