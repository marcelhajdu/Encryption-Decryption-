class Primitive {
    public static boolean toPrimitive(Boolean b) {
        if(b == null) {
            return false;
        } else if(b.booleanValue() == false) {
            return false;
        } else {
            return true;
        }
    }
}