//public int offsetByCodePoints(int index, int codePointOffset)

String str = "";
StringBuilder sb = new StirngBuilder(str);

for(int i = 0; i < sb.offsetByCodePoints(0, 5);
  i = sb.offsetByCodePoints(i, 1)){
  int codepoint = str.codePointAt(i);
  System.out.printf("%c [u+%h]%n", codepoint, codepoint);
}

