/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.smartartinpresentation.managingsmartartstyle.smartartcolorstyle.java;

import com.aspose.slides.*;

public class SmartArtColorStyle
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/smartartinpresentation/managingsmartartstyle/smartartcolorstyle/data/";

        //Instantiate Presentation Class
        Presentation pres = new Presentation(dataDir+ "SimpleSmartArt.pptx");

        //Get first slide
        ISlide slide = pres.getSlides().get_Item(0);

        //Traverse through every shape inside first slide
        for(IShape shape : slide.getShapes())
        {
            //Check if shape is of SmartArt type
            if (shape instanceof ISmartArt)
            {
                //Typecast shape to SmartArtEx
                ISmartArt smart = (ISmartArt)shape;

                //Checking SmartArt color type
                if (smart.getColorStyle() == SmartArtColorType.ColoredFillAccent1)
                {
                    //Changing SmartArt color type
                    smart.setColorStyle(SmartArtColorType.ColorfulAccentColors);
                }
            }
        }
        //Saving presentation
        pres.save(dataDir+ "ChangeSmartArtColorStyle.pptx", SaveFormat.Pptx);
    }
}




