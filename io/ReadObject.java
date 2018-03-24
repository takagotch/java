//public final Object readObject()

try{
  File f = new File("chap5/data/obTemp.txt");
  try(ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream(f))){
    op.writeObject("The answer is blowin' in the wind");
  }
  
  try(ObjectInputStream oi = new ObjectInpuStream(new FileInputStream(f))){
    System.out.println((String) oi.readObject());
  }
}

