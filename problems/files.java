class Files{
    public String fileName; // ファイル名
    public String fileExtension; // ファイルの拡張子。.word、.png、.mp4、.pdf でない場合は、.txt に設定されます。
    public String content; // ファイルに含まれるコンテンツ
    public String parentFolder; // ファイルが置かれているフォルダの名前

    public Files(String fileName,String fileExtension,String content,String parentFolder){
        this.fileName = fileName;
        this.fileExtension = fileExtension;
        this.content = content;
        this.parentFolder = parentFolder;
    }

    // サービス中に使われるファイルの最大容量を返します。content に含まれる文字（空白文字も含む）につき、25MB として計算してください。
    //例えば、40 文字含まれている場合、40 * 25MB = 1,000MB = 1GBになります。単位の最大はG（ギガ）とします。1000MB　以上は単位を GB に変換してください。
    public String getLifetimeBandwidthSize(){
        double sizeMB = this.content.length() * 25;
        double sizeGB = sizeMB / 1000;
        return sizeMB >= 1000 ? sizeGB + "GB" : (int)sizeMB + "MB";
    } 

    // ファイルの content の先頭にデータ文字列を追加し、新しい content を返します。
    public String prependContent(String data){
        this.content = data + this.content; 
        return this.content;
    }

    // ファイルの content の指定した位置（インデックス）にデータ文字列を追加し、新しい content を返します。
    public String addContent(String data, int position){
        this.content = this.content.substring(0,position) + data + this.content.substring(position, content.length());
        return this.content;
    }

    // 親ファイル > ファイル名.拡張子という形で返します。
    public String showFileLocation(){
        if(this.fileExtension == ".word" || this.fileExtension == ".png" || this.fileExtension == ".mp4" || this.fileExtension == ".pdf"){
            return this.parentFolder + " > " + this.fileName + this.fileExtension;
        } else {
            return this.parentFolder + " > " + this.fileName + ".txt";
        }
    }  
}


class MyClass{
    public static void main(String[] args){
        Files assignment = new Files("assignment", ".word", "ABCDEFGH", "homework");
        System.out.println(assignment.getLifetimeBandwidthSize()); //--> 200MB
        System.out.println(assignment.prependContent("MMM")); //--> MMMABCDEFGH
        System.out.println(assignment.addContent("hello world", 5)); //--> MMMABhello worldCDEFGH
        System.out.println(assignment.showFileLocation()); //--> homework > assignment.word

        Files blade = new Files("blade", ".txt", "bg-primary text-white m-0 p-0 d-flex justify-content-center", "view");
        System.out.println(blade.getLifetimeBandwidthSize()); //--> 1.475GB
        System.out.println(blade.addContent("font-weight-bold ", 11)); //--> bg-primary font-weight-bold text-white m-0 p-0 d-flex justify-content-center
        System.out.println(blade.showFileLocation()); //--> view > blade.txt
    }
}
