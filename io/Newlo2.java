//public static FileSystem getDefault()

FileSystem fileSystem = FileSystems.getDefault();

for(Path name : fileSystem.getRootDirectories()){
  System.out.println(name);
}

