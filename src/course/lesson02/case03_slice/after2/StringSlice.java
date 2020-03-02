package course.lesson02.case03_slice.after2;

public class StringSlice {
    private String source;
    private int start;
    private int end;

    public StringSlice(String source) {
        this.source = source;
        start = 0;
        end = source.length();
    }

    public StringSlice slice(int start, int end) {
        StringSlice slice = new StringSlice(this.source);
        slice.start = this.start + start;
        slice.end = this.start + end;
        return slice;
    }

    public StringSlice slice(int start) {
        StringSlice slice = new StringSlice(this.source);
        slice.start = this.start + start;
        slice.end = this.end;
        return slice;
    }

    public int indexOf(String search) {
        return source.indexOf(search, this.start) - this.start;
    }

    public int length() {
        return this.end - this.start;
    }

    @Override
    public String toString() {
        return source.substring(this.start, this.end);
    }
}
