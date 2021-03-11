class Tree { 
  
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;
 
  Tree() 
  {
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }
  
  Tree(String atreeName, String atreeType, boolean 
  aleavesFall, String aleafColor) {
   
    treeName = atreeName;
    treeType = atreeType;
    leavesFall = aleavesFall;
    leafColor = aleafColor;
  }

  void setName(String theTreeName) {
   treeName = theTreeName;
   }

  void setType(String theTreeType) {
   treeType = theTreeType;
   }

  void setleavesFall(boolean theleavesFall) {
   leavesFall = theleavesFall;}

  void setleafColor(String theLeafColor)
   {
   leafColor = theLeafColor;
   }

  String getTreeName() {
    return treeName;}

  String getType() {
    return treeType;}

  boolean getLeavesFall()
   {
    return leavesFall;}

  String getLeafColor() {
    return leafColor;}

  void print() {
    String does = "does";
   
    if (leavesFall == false) {
    does = "does not";}
  
    System.out.println("This is a " + treeName + "tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It " + does + " lose its leaves for the winter.");
    }

}