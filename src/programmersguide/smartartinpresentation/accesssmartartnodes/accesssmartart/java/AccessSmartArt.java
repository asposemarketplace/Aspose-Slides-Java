/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.smartartinpresentation.accesssmartartnodes.accesssmartart.java;

import com.aspose.slides.*;

public class AccessSmartArt
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/smartartinpresentation/accesssmartartnodes/accesssmartart/data/";

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

                //Traverse through all nodes inside SmartArt
                for (int i = 0; i < smart.getAllNodes().getCount(); i++)
                {
                    //Accessing SmartArt node at index i
                    SmartArtNode node = (SmartArtNode)smart.getAllNodes().get_Item(i);

                    //Printing the SmartArt node parameters
                    System.out.print(node.getTextFrame().getText()+" " + node.getLevel()+" " + node.getPosition());

                }
            }
        }
    }
}




