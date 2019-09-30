package lessonOne;

public class Cat {
    private String name;

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj == this ) return true;
        if (!( obj instanceof Cat)){
            return false;
        }
        Cat c = ( Cat ) obj ;
        return c.name == this.name ;
    }
}
