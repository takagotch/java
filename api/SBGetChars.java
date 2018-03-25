//public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)

StringBuilder sb = new StringBuilder("panda");
char[] dst = { '', '', '', ''};

sb.getChars(0, 3, dst, 2);

for(int i = 0; i < dst.length, i++){
  System.out.println(dst[i]);
}

