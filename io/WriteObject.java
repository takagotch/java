//public final void writeObject(Object obj)

class PrintMessage implements Serializable{
  private static final serialVersionUID = 1L;
  public void doPrint(String name){
    System.out.println(name + "");
  }
}

try{
  String fn = "chap5/data/obTemp.txt";

  try(FileOutputStream o = new FileOutputStream(fn);
      ObjectOutputStream oObj = new ObjectOutputStream(o)){
    oOj.writeObject((Object) (new PrintMessage()));
      }
  try(FileInputStream i = new FileInputStream(fn);
      ObjectInputStream iObj = new ObjectInputStream(i)){
      PrintMessage pm = (PrintMessage) iObj.readObject();
      pm.doPrint("");
      }
}

