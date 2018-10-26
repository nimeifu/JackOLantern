public class JackOLantern {

    private String[][] faceFeatures;

    public JackOLantern(String[] [] faceFeatures)
    {
        this.faceFeatures=faceFeatures;
    }
    public void edit(String replace,int row, int column)
    {
        faceFeatures[row][column]=faceFeatures[replace.indexOf(row)][replace.indexOf(column)];
    }
    public void fill(String str)
    {
        for(int i=0;i<faceFeatures.length;i++)
        {
            for(int j=0;j<faceFeatures.length;j++)
            {
                faceFeature[str.indexOf(i)],[str.indexOf(j)];
            }
        }
    }

}

