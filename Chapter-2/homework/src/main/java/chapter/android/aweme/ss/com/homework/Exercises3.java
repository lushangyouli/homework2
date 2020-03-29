package chapter.android.aweme.ss.com.homework;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextPaint;
import android.widget.TextView;

import java.io.InputStream;
import java.util.List;

import chapter.android.aweme.ss.com.homework.model.Message;
import chapter.android.aweme.ss.com.homework.model.PullParser;

/**
 * 大作业:实现一个抖音消息页面,
 * 1、所需的data数据放在assets下面的data.xml这里，使用PullParser这个工具类进行xml解析即可
 * <p>如何读取assets目录下的资源，可以参考如下代码</p>
 * <pre class="prettyprint">
 *
 *         @Override
 *     protected void onCreate(@Nullable Bundle savedInstanceState) {
 *         super.onCreate(savedInstanceState);
 *         setContentView(R.layout.activity_xml);
 *         //load data from assets/data.xml
 *         try {
 *             InputStream assetInput = getAssets().open("data.xml");
 *             List<Message> messages = PullParser.pull2xml(assetInput);
 *             for (Message message : messages) {
 *
 *             }
 *         } catch (Exception exception) {
 *             exception.printStackTrace();
 *         }
 *     }
 * </pre>
 * 2、所需UI资源已放在res/drawable-xxhdpi下面
 *
 * 3、作业中的会用到圆形的ImageView,可以参考 widget/CircleImageView.java
 */
public class Exercises3 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);
        //load data from assets/data.xml
        try {
            InputStream assetInput = getAssets().open("data.xml");
            List<chapter.android.aweme.ss.com.homework.model.Message> messages = PullParser.pull2xml(assetInput);
//            for (int i = 0; i < messages.size(); i++) {
//                Message message = messages.get(i);
//            }
            TextView tv1 = findViewById(R.id.tv1);
            tv1.setTextSize(20);
            //TextPaint tp = tv1.getPaint();
            //tp.setFakeBoldText(true);
            //tv1.setTextColor(Color.RED);
            tv1.setText("    "+messages.get(0).getTitle());
            //tp.setFakeBoldText(false);
            //tv1.setTextColor(Color.GRAY);
            tv1.append("                                "+messages.get(0).getTime()+"\n    "+messages.get(0).getDescription()+"\n");

            TextView tv2 = findViewById(R.id.tv2);
            tv2.setTextSize(20);
            tv2.setText("    "+messages.get(1).getTitle());
            tv2.append("                                "+messages.get(1).getTime()+"\n    "+messages.get(1).getDescription()+"\n");

            TextView tv3 = findViewById(R.id.tv3);
            tv3.setTextSize(20);
            tv3.setText("    "+messages.get(2).getTitle());
            tv3.append("                                  "+messages.get(2).getTime()+"\n    "+messages.get(2).getDescription()+"\n");

            TextView tv4 = findViewById(R.id.tv4);
            tv4.setTextSize(20);
            tv4.setText("    "+messages.get(3).getTitle());
            tv4.append("                              "+messages.get(3).getTime()+"\n    "+messages.get(3).getDescription()+"\n");

            TextView tv5 = findViewById(R.id.tv5);
            tv5.setTextSize(20);
            tv5.setText("    "+messages.get(4).getTitle());
            tv5.append("                                      "+messages.get(4).getTime()+"\n    "+messages.get(4).getDescription()+"\n");

            TextView tv6 = findViewById(R.id.tv6);
            tv6.setTextSize(20);
            tv6.setText("    "+messages.get(5).getTitle());
            tv6.append("                                "+messages.get(5).getTime()+"\n    "+messages.get(5).getDescription()+"\n");

            TextView tv7 = findViewById(R.id.tv7);
            tv7.setTextSize(20);
            tv7.setText("    "+messages.get(6).getTitle());
            tv7.append("                                "+messages.get(6).getTime()+"\n    "+messages.get(6).getDescription()+"\n");

            TextView tv8 = findViewById(R.id.tv8);
            tv8.setTextSize(20);
            tv8.setText("    "+messages.get(7).getTitle());
            tv8.append("                                  "+messages.get(7).getTime()+"\n    "+messages.get(7).getDescription()+"\n");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
