//public CharArrayWriter([int initialSize])

try(InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(ir);
    CharArrayWriter caw = new CharArrayWriter();){
    
    System.out.print("Input : ");
    caw.write("[CharArray]" + in.readLine());

    CharArrayReader car = new CharArrayReader(caw.toCharArray());

    int data;
    while((data = car.read()) != -1){
      System.out.print((char) data);
    }
}


