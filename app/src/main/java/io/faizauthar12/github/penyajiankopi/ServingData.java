package io.faizauthar12.github.penyajiankopi;

import java.util.ArrayList;

public class ServingData {
    private static String[] servingNames = {
            "Penyajian 1",
            "Penyajian 2",
            "Penyajian 3",
            "Penyajian 4"
    };

    private static String[] servingDetails = {
            "Penyajian 1",
            "Penyajian 2",
            "Penyajian 3",
            "Penyajian 4"
    };

    private static int[] servingImages = {
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download
    };

    static ArrayList<Serving> getListData() {
        ArrayList<Serving> list = new ArrayList<>();
        for (int position = 0; position < servingNames.length; position++) {
            Serving serving = new Serving();
            serving.setName(servingNames[position]);
            serving.setDetail(servingDetails[position]);
            serving.setImg(servingImages[position]);
            list.add(serving);
        }
        return list;
    }
}
