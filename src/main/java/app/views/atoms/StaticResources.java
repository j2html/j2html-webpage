package app.views.atoms;

import j2html.src.tags.Tag;

import static j2html.src.tags.TagCreator.link;
import static j2html.src.tags.TagCreator.script;
import static j2html.src.tags.TagCreator.unsafeHtml;

public class StaticResources {

    public static Tag favicon() {
        return link().withRel("icon").withHref("/img/favicon.png");
    }

    public static Tag css_main() {
        return link().withRel("stylesheet").withHref("/css/main.css");
    }

    public static Tag css_main_inline() {
        return unsafeHtml("html{background:url(/img/pattern.png) fixed;color:#43485a;font-family:arial,sans-serif}h1,h2,h3,nav a{font-family:\"Lato\",sans-serif}html{overflow-y:scroll}html,body{margin:0}*{font-weight:300;box-sizing:border-box}p{line-height:24px;text-align:justify}a{color:#3a96da}li{line-height:20px;margin:10px 0}p,li{font-size:15px}header a img{position:absolute;margin-left:-60px;margin-top:10px;max-width:50px}h1.banner{box-shadow:0 2px 6px rgba(0,0,0,0.3);margin:-20px -30px 0 -90px;text-align:center;font-size:35px;color:#fff;text-shadow:1px 1px 1px rgba(0,0,0,0.5);padding:15px}h2{margin-bottom:-10px}body{max-width:876px;margin:20px auto 0;background:#fff;box-shadow:0 1px 4px rgba(0,0,0,0.5)}main{padding:20px}footer{border-top:1px solid #ddd;text-align:center;padding:10px;font-size:12px}nav a{text-decoration:none;text-align:center;color:#2d425a;display:inline-block;width:19%;width:calc(25% - 50px);padding:25px 10px 5px;border-bottom:20px solid #fff;margin:0 25px;font-size:25px}a.active:nth-child(1){border-color:#f45a52}a.active:nth-child(2){border-color:#10a8c6}a.active:nth-child(3){border-color:#e4599d}a.active:nth-child(4){border-color:#4dcd81}#index h1{background:#f45a52}#download h1{background:#10a8c6}#examples h1{background:#e4599d}#news h1{background:#4dcd81}@media screen and (max-width: 1024px){#fork-me,header a img{display:none}h1.banner{box-shadow:0 2px 6px rgba(0,0,0,0.3);margin:-20px 0 0;border-radius:0;font-size:25px;padding:15px}nav a{padding:15px 10px 10px;border-bottom:15px solid #fff;width:calc(25% - 40px);margin:0 20px;font-size:20px}}@media screen and (max-width: 666px){nav a{padding:15px 0 10px;margin:0 10px;width:calc(25% - 25px);font-size:16px}nav a:first-of-type{margin-left:20px}nav a:last-of-type{margin-right:20px}}@media screen and (max-width: 480px){nav a{font-size:12px}}");
    }

    public static Tag css_prism() {
        return link().withRel("stylesheet").withHref("/css/prism.css");
    }

    public static Tag font_lato() {
        return link().withRel("stylesheet").withHref("http://fonts.googleapis.com/css?family=Lato:100,300,400,700");
    }

    public static Tag script_prism() {
        return script().withSrc("/js/prism.js");
    }

    public static Tag script_googleTagmanager() {
        return unsafeHtml("<noscript><iframe src=\"//www.googletagmanager.com/ns.html?id=GTM-W4XBCK\"height=\"0\" width=\"0\" style=\"display:none;visibility:hidden\"></iframe></noscript><script>(function(w,d,s,l,i){w[l]=w[l]||[];w[l].push({'gtm.start':new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src='//www.googletagmanager.com/gtm.js?id='+i+dl;f.parentNode.insertBefore(j,f);})(window,document,'script','dataLayer','GTM-W4XBCK');</script>");
    }

    public static Tag banner_gitHub() {
        return unsafeHtml("<a id=\"fork-me\" href=\"https://github.com/tipsy/j2html\" target=\"_blank\">\n" +
                "    <img style=\"position:fixed;top:0;right:0;border:0;z-index:99999\"\n" +
                "    src='data:image/png;base64,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'\n" +
                "    alt=\"Fork me on GitHub\">\n" +
                "</a>");
    }

}
