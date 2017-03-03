package gradient;

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by leoz on 2016/12/15.
 */
public class GradientDescent {
    public static void main(String[] args) {
//        List<Integer> list = Lists.newArrayList();
//        for (int i = 0; i < 1000; i++) {
//            list.add(i);
//        }
//        Collections.shuffle(list);
//
//        System.out.println(list);

//        Random random = new Random();
        GradientDescent gradientDescent = new GradientDescent();
        for (int i = 0; i < 10; i++) {
            System.out.println(gradientDescent.getRandomNumber(10, 10));
        }


    }

    public List<Integer> getRandomNumber(int max, int number) {
        List<Integer> result = Lists.newArrayList();
        if (number > max) {
            return result;
        }
        List<Integer> index = Lists.newArrayList();
        for (int i = 0; i < max; i++) {
            index.add(i);
        }
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            int current = random.nextInt(max - i);
            int tmp = index.get(current);
            index.set(current, index.get(max - i - 1));
            result.add(tmp);
        }
        return result;
    }
}
