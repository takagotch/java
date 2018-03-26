//try(){}

try(FileInputStream fis = new FileInputStream("file.txt"){
  int content;
  while((contetn = fis.read()) != -1){
    System.out.print((char)content);
  }
} catch(Exception e){
  e.printStackTrace();
}

