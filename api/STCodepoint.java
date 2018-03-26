//public int offsetByCodePoints(int index, int codePointOffset)

String str = "";

for(int i = 0; i < str.offsetByCodePoints(0, 5);
  i = str.offsetByCodePoints(i, 1)){
  int codepoint = str.codePointAt(i);
  System.out.printf("%c [u+%h]%n", codepoint, codepoint);
  }

