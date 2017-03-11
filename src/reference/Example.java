package reference;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/**
 * Created by zwp on 17/3/11.
 */
public class Example {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        WeakReference<HashMap> wr = new WeakReference<HashMap>(hashMap);
    }
}
