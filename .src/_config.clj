{
 ;; directory setting
 ;;   defailed information: http://liquidz.github.io/misaki/toc/02-directory-structure.html
 :public-dir   "../"
 :tag-out-dir  "tag/" ;; => {public-dir}/{tag-outdir}/{tag}.html
 :template-dir "template/" ;; => ./{template-dir}
 :post-dir     "posts/"    ;; => ./{template-dir}/{post-dir}
 :layout-dir   "layouts/"  ;; => ./{template-dir}/{layout-dir}
 :tag-layout   "tag"       ;; => ./{template-dir}/{layout-dir}/{tag-layout}.html
 :post-filename-regexp #"^.+$"
 ;;:post-filename-format "$(year)-$(month)/$(filename)"
 :post-filename-format "article/$(year)/$(month)/$(day)_$(filename)" ;; o-blog format
 :compile-with-post ["index.html" "archives.html" "atom.xml"]
 :url-base "/"
 :posts-per-page 10
 :recent-posts-num 5
 :emacs "/usr/local/bin/emacs"
 :lang "ja"

 :site {:site-title    "ざる魂"
        :site-subtitle "人生パクリパクラレ。技術もパクリパクラレ。知られざる我が魂。" 
        :your-domain   "mikio.github.io"
        :atom          "atom.xml"
        :atom-base     "http://localhost:8080"
        :twitter-id    "zarudama_games"
        :disqus-id     ""
        :local {:css   ["css/main.css"]
                :js    ["js/main.js"]}

    <link rel="stylesheet" href="css/pricing.css">
        :remote {:css ["http://fonts.googleapis.com/css?family=Josefin+Sans"
                       "http://yui.yahooapis.com/pure/0.3.0/pure-min.css"]}}

 ;; misaki-orgmode configuration
 ;; cuma extension file
 :cuma {:extension "extension.clj"}

 :compiler ["orgmode"] 
}

