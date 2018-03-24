//StringWriter([int initialSize])

char arr[] = {'2', '0', '1', '5'};
try(StringWriter sr = new StringWriter()){
  sr.append("last year: ");

  sr.write(arr);

  System.out.println(sr);
}

