class SimpleHashItem {
    private String value;
    private int key;
    private SimpleHashItem nextItem;
    public SimpleHashItem(String value, int key  ){
        this.value = value;
        this.key = key;
    }
    public SimpleHashItem getNextItem(){
        return this.nextItem;
    }
    public void setNextItem(SimpleHashItem newNextItem){
       this.nextItem = newNextItem;
    }
    public String getValue(){
        return this.value;
    }
    public void setValue(String newValue){
        this.value = newValue;
    }
    public int getKey(){
        return this.key;
    }
    public void setKey(int newKey){
        this.key = newKey;
    }
}
