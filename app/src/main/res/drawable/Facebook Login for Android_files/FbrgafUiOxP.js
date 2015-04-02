/*!CK:1014998487!*//*1425869050,*/

if (self.CavalryLogger) { CavalryLogger.start_js(["qp3gV"]); }

__d("ErrorLogging",["ErrorSignal","ErrorUtils","JSErrorExtra","JSErrorPlatformColumns"],function(a,b,c,d,e,f,g,h,i,j){b.__markCompiled&&b.__markCompiled();function k(m){var n=m.extra||{},o={};Object.keys(i).forEach(function(p){if(i[p])o[p]=true;});Object.keys(n).forEach(function(p){if(n[p]){o[p]=true;}else if(o[p])delete o[p];});m.extra=Object.keys(o);}function l(m){m.app_id=j.app_id;}h.addListener(function(m){k(m);l(m);g.logJSError(m.category||'onerror',{error:m.name||m.message,extra:m});});},null);
__d("ImageDownloadWaterfallLoggerOnload",["BanzaiLogger","ImageDownloadWaterfallStep"],function(a,b,c,d,e,f,g,h){b.__markCompiled&&b.__markCompiled();function i(m){k({step:h.DOWNLOAD_SUCCEED,image_id:m.getAttribute('data-pdwimageid'),image_uri:m.src});}function j(m){k({step:h.DOWNLOAD_FAILED,image_uri:m.src});}function k(m){g.log('ImageDownloadWaterfallLoggerConfig',m);}var l={init:function(){if(!a.ImageDownloadWaterfallLogger)return;if(a.ImageDownloadWaterfallLogger.isInitalized)return;a.ImageDownloadWaterfallLogger.isInitalized=true;var m=a.ImageDownloadWaterfallLogger;m.logSuccess=i;m.logFailed=j;if(m.entries){m.entries.forEach(k);m.entries=null;}}};e.exports=l;},null);
__d("ImageFailLoggerOnload",["Banzai"],function(a,b,c,d,e,f,g){b.__markCompiled&&b.__markCompiled();var h="image_fail_load",i=false;function j(m){k({image_uri:m.src});}function k(m){g.post(h,m);}var l={init:function(){if(!a.ImageFailLogger)return;if(i)return;i=true;for(var m=0;m<a.ImageFailLogger.entries.length;m++)k(a.ImageFailLogger.entries[m]);a.ImageFailLogger.entries=null;a.ImageFailLogger.logImageFail=j;}};e.exports=l;},null);
__d("TimeSpentNavigations",["Arbiter","Event","ScriptPath"],function(a,b,c,d,e,f,g,h,i){b.__markCompiled&&b.__markCompiled();var j=null,k={subscribeOnce:function(n){var o=k.subscribe(function(){k.unsubscribe(o);n();});},subscribe:function(n){return g.subscribe('timespentnavigations/click',n);},unsubscribe:function(n){n.unsubscribe();},getLastNavigation:function(){return j;}};function l(event){var n=event.target||event.srcElement;j=m(n);g.inform('timespentnavigations/click',{event:event,navigation:j});}h.listen(document.documentElement,{click:l});function m(n){var o=null;for(;!o&&n&&n.getAttribute;n=n.parentNode)o=n.getAttribute('data-referrer');return o;}i.subscribe(function(){i.setNavigation(j);});e.exports=k;},null);
__d("ModalLayerBugNub",["DOM","ModalLayer"],function(a,b,c,d,e,f,g,h){b.__markCompiled&&b.__markCompiled();var i=false,j={init:function(k){if(i)return;i=true;h.subscribe('show',function(l,m){g.appendContent(m.getLayerContentRoot(),k);});h.subscribe('hide',function(l,m){g.remove(k);});}};e.exports=j;},null);
__d("XDeveloperTasksDetailController",["XController"],function(a,b,c,d,e,f){b.__markCompiled&&b.__markCompiled();e.exports=b("XController").create("\/bugs\/{task_id}\/",{task_id:{type:"Int",required:true},comment_id:{type:"Int"},search_id:{type:"String"}});},null);