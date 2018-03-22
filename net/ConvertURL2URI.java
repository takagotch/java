//public URI toURI()

URI uri = new URI("file://C:/Windows");

URL url = uri.toURL();

System.out.println(uri.equals(url.toURI()));

