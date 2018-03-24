//StringReader(String s)

try(StringReader sr = new StringReader("sample")){
  char[] data = new char[1];

  while(sr.read(data) != -1){
    System.out.println(data);
  }
} catch(IOException e){
  e.printStackTrace();
}

