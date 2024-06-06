package pattern.bridge;

public class Mp3Record implements Record {
    private final String name;

    public Mp3Record(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Play " + name + " " + getFormat());
    }

    @Override
    public void stop() {
        System.out.println("Stop " + name + " " + getFormat());
    }

    @Override
    public String getName() {
        return name;
    }

    public String getFormat() {
        return "mp3";
    }
}
