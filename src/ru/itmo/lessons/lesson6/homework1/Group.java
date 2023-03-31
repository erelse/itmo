/*
package ru.itmo.lessons.lesson6.homework1;

public class Group {
    private Mountain mount;
    private Climber[] climb;
    private int index;
    private boolean enter;

    public Group(Mountain mount, int index, boolean enter) {
        this.enter = enter;
        this.index = index;
        this.mount = mount;

        setMountain(mount);
        setClimber(index);

    }

    public void setClimber(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("bgnhhh");
        }
        climb = new Climber[3];
        this.index = index;
    }

    public void setMountain(Mountain mount) {
        if (mount == null) {
            throw new IllegalArgumentException("дефолтное значение mount = null");
        }

        this.mount = mount;
    }

    public boolean getEnter() {
        return enter;
    }

    public Climber[] getClimb() {
        return climb;
    }

    public Mountain getMount() {
        return mount;
    }

    public void CatchClimb(Climber climb) {
        if (index < 3) {
            climb[index] = Climber;
            index++;
        } else {
            System.out.println("в группе нет свободных мест");

        }
        return;


    }
}
*/
