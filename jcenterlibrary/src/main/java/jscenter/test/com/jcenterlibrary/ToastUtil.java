package jscenter.test.com.jcenterlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * <P>  <P>  <P>  <P>
 * Created by JiangShang on 2015/9/22.
 */
public class ToastUtil {
    public static void toast(String str, Context context) {
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show();
    }
     public static void sayTime(Context context) {
       toast(System.currentTimeMillis()+"",context);
    }
      public static void sayTime1(Context context) {
       toast(System.currentTimeMillis()+"",context);
    }

}
