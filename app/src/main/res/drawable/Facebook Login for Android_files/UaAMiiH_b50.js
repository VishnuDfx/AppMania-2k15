/*!CK:2787020500!*//*1425877612,*/

if (self.CavalryLogger) { CavalryLogger.start_js(["6byqv"]); }

__d("DeveloperAppPage",[],function(a,b,c,d,e,f){b.__markCompiled&&b.__markCompiled();e.exports={DASHBOARD:"dashboard",SETTINGS:"settings",REVIEW_STATUS:"review-status",APP_DETAILS:"app-details",ROLES:"roles",OPEN_GRAPH:"open-graph",GAME_SETTINGS:"game-settings",ALERTS:"alerts",LOCALIZE:"localize",PAYMENTS:"payments",MONETIZE:"audience-network",TEST_APPS:"test-apps"};},null);
__d("ScrubberMaintainAnchors",[],function(a,b,c,d,e,f){b.__markCompiled&&b.__markCompiled();function g(h){"use strict";this.$ScrubberMaintainAnchors0=h;}g.prototype.enable=function(){"use strict";this.$ScrubberMaintainAnchors1=this.$ScrubberMaintainAnchors0.subscribe('scrub',this.$ScrubberMaintainAnchors2.bind(this));};g.prototype.disable=function(){"use strict";this.$ScrubberMaintainAnchors1.unsubscribe();this.$ScrubberMaintainAnchors1=null;};g.prototype.$ScrubberMaintainAnchors2=function(h,i){"use strict";if(i){var j=i.getAttribute('data-target');if(j!=='')history.pushState(null,null,'#'+j);}};e.exports=g;},null);
__d("Scrubber",["Arbiter","ArbiterMixin","BehaviorsMixin","CSS","DOM","DOMQuery","DOMScroll","Event","Focus","Keys","Parent","ScrollableArea","arrayContains","csx","cx","ge","mixin"],function(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w){b.__markCompiled&&b.__markCompiled();var x=w(h,i);for(var y in x)if(x.hasOwnProperty(y))aa[y]=x[y];var z=x===null?null:x.prototype;aa.prototype=Object.create(z);aa.prototype.constructor=aa;aa.__superConstructor__=x;function aa(ga,ha,ia,ja){"use strict";this._root=ga;this.update();this._tabbableElement=k.scry(this._root,'a')[0];this._scrollArea=ja;n.listen(ga,'click',this._handleClick.bind(this));n.listen(ga,'keydown',this._moveFocus.bind(this));g.subscribe('Scrubber/newContent',this.update.bind(this));ia&&this.enableBehaviors(ia);this.select(ha);}aa.prototype.update=function(){"use strict";this._targets=[];l.scry(this._root,"li._ga").forEach(function(ga){var ha=aa.getTarget(ga);if(ha)this._targets.push({item:ga,node:ha});}.bind(this));this.inform('update');};aa.prototype.select=function(ga){"use strict";ga=fa(ga);if(ga===this._selected)return;if(!this.isScrubbing()||this._isScrubbingTo(ga))if(this.inform('select',ga)===false)return;var ha=ea(ga),ia=-1;if(this._selected){var ja=ea(this._selected);for(var ka=ja.length-1;ka>=0;ka--){if(s(ha,ja[ka])){ia=ka;break;}this._setSelected(ja[ka],false);}if(ia<0)this.inform('roll',ja[0]);this._selected=null;}if(ga){for(var la=ia+1;la<ha.length;la++)this._setSelected(ha[la],true);if(ia<0)this.inform('unroll',ha[0]);this._selected=ga;}};aa.prototype.scrollTo=function(ga,ha,ia){"use strict";if(this._scrollArea){this.getScrollAreaJS().scrollElemToTop(ga,ha,ia);}else m.scrollTo(ga,ha,false,false,0,ia);};aa.prototype.scrub=function(ga){"use strict";if(this._scrubItem===ga)return;if(this.inform('scrub',ga)===false)return;var ha=aa.getTarget(ga);if(ha){this._scrubItem=ga;this._scrub&&this._scrub.stop();this._scrub=this.scrollTo(ha,750,function(){this._scrubItem=null;this._scrub=null;if(this.inform('afterscrub',ga)!==false)if(!this._scrollArea)this.select(ga);}.bind(this));}else this.select(ga);};aa.prototype.isScrubbing=function(){"use strict";return !!this._scrub;};aa.prototype.getSelected=function(){"use strict";return this._selected;};aa.prototype.getTargets=function(){"use strict";return this._targets;};aa.prototype.getScrollArea=function(){"use strict";return this._scrollArea;};aa.prototype.getScrollAreaJS=function(){"use strict";if(!this._scrollAreaJS&&this._scrollArea)this._scrollAreaJS=r.getInstance(this._scrollArea);return this._scrollAreaJS;};aa.prototype._handleClick=function(event){"use strict";var ga=q.byTag(event.getTarget(),'li');if(ga&&ba(ga)&&ca(ga)){this.scrub(ga);return false;}};aa.prototype._isScrubbingTo=function(ga){"use strict";return this._scrubItem&&this._scrubItem===ga;};aa.prototype._setSelected=function(ga,ha){"use strict";j.conditionClass(ga,"_5a",ha);};aa.prototype._moveFocus=function(event){"use strict";if(event.getModifiers().any)return;var ga=n.getKeyCode(event);if(ga===p.UP||ga===p.DOWN){var ha=k.scry(this._root,'a').filter(function(ka){return ka.offsetHeight||ka.offsetWidth;}),ia=ha.indexOf(this._tabbableElement);if(ia!=-1){var ja=ha[ia+(ga===p.UP?-1:1)];if(ja){ja.tabindex=0;o.set(ja);this._tabbableElement.tabindex=-1;this._tabbableElement=ja;event.prevent();}}}};aa.getLink=function(ga){"use strict";return ga.childNodes[0];};aa.getRollup=function(ga){"use strict";return ga.childNodes[1];};aa.getTarget=function(ga){"use strict";return v(ga.getAttribute('data-target'));};function ba(ga){return j.hasClass(ga,"_ga");}function ca(ga){return aa.getLink(ga).getAttribute('rel')==='scrubber';}function da(ga){return q.byClass(ga.parentNode,"_ga");}function ea(ga){var ha=[];while(ga){ha.unshift(ga);ga=da(ga);}return ha;}function fa(ga){var ha=aa.getRollup(ga);if(ha)if(ga=l.scry(ha,"li._ga")[0])return fa(ga);return ga;}e.exports=aa;},null);
__d("ScrubberResizeRollups",["Scrubber","Style"],function(a,b,c,d,e,f,g,h){b.__markCompiled&&b.__markCompiled();function i(j){"use strict";this.$ScrubberResizeRollups0=j;}i.prototype.enable=function(){"use strict";this.$ScrubberResizeRollups1=this.$ScrubberResizeRollups0.subscribe(['roll','unroll'],function(j,k){return this.$ScrubberResizeRollups2(k,j==='unroll');}.bind(this));};i.prototype.disable=function(){"use strict";this.$ScrubberResizeRollups1.unsubscribe();this.$ScrubberResizeRollups1=null;};i.prototype.$ScrubberResizeRollups2=function(j,k){"use strict";var l=g.getRollup(j);if(l)if(k){this.$ScrubberResizeRollups3&&clearTimeout(this.$ScrubberResizeRollups3);this.$ScrubberResizeRollups3=setTimeout(function(){h.set(l,'height',l.scrollHeight+'px');},750);}else h.set(l,'height','0');};e.exports=i;},null);
__d("DevsiteAppUpgradeBanner",["AsyncRequest","DOMEventListener","XDeveloperUpgradeBannerHideAsyncController"],function(a,b,c,d,e,f,g,h,i){b.__markCompiled&&b.__markCompiled();var j={init:function(k){h.add(k,'click',function(){new g().setMethod('POST').setURI(i.getURIBuilder().getURI()).send();});}};e.exports=j;},null);
__d("DevsiteHeaderFixedElement",["CSS","DOM","DOMEventListener","cx"],function(a,b,c,d,e,f,g,h,i,j){b.__markCompiled&&b.__markCompiled();var k={initClose:function(l,m){i.add(m,'click',function(){g.addClass(l.parentNode,"_4h2v");setTimeout(function(){return h.remove(l.parentNode);},1000);});}};e.exports=k;},null);
__d("DevsiteLinkDialog",["AsyncRequest","Event","URI","$"],function(a,b,c,d,e,f,g,h,i,j){b.__markCompiled&&b.__markCompiled();var k={showRegistered:function(l,m,n){h.listen(j(l),'click',function(){n.show();return false;});var o=l.match(RegExp('^'+m+'(.+)'));if(o&&o[1]===i.getRequestURI().getFragment())n.show();},showAsync:function(l,m){h.listen(j(l),'click',function(){new g().setURI(m).send();return false;});}};e.exports=k;},null);
__d("DevsiteReferenceTable",["CSS","cx","DOMQuery","Event","Parent"],function(a,b,c,d,e,f,g,h,i,j,k){b.__markCompiled&&b.__markCompiled();function l(m){"use strict";j.listen(m,'click',function(event){var n=k.byTag(event.getTarget(),'tr');if(!g.hasClass(n,"_5m27"))return;this.$DevsiteReferenceTable0(m,n,m.rows);}.bind(this));}l.prototype.$DevsiteReferenceTable0=function(m,n,o){"use strict";var p=this.$DevsiteReferenceTable1(n),q=g.hasClass(n,'open'),r=[].indexOf.call(o,n)+1;for(var s=r;s<o.length;s++){var t=o[s],u=this.$DevsiteReferenceTable1(t);if(!this.$DevsiteReferenceTable2(p,u))break;if(q){g.hide(t);}else if(this.$DevsiteReferenceTable3(p,u)){g.show(t);}else if(g.hasClass(this.$DevsiteReferenceTable4(m,u),'open'))g.show(t);}g.toggleClass(n,'open');};l.prototype.$DevsiteReferenceTable1=function(m){"use strict";return (/row_((\d+-?)+)/).exec(m.className)[1];};l.prototype.$DevsiteReferenceTable4=function(m,n){"use strict";var o=n.split('-');o.pop();return i.find(m,'tr.row_'+o.join('-'));};l.prototype.$DevsiteReferenceTable2=function(m,n){"use strict";return n.substring(0,m.length+1)===m+'-';};l.prototype.$DevsiteReferenceTable3=function(m,n){"use strict";var o=n.substr(m.length+1);return o.indexOf('-')<0;};e.exports=l;},null);
__d("XDeveloperAppController",["XController"],function(a,b,c,d,e,f){b.__markCompiled&&b.__markCompiled();e.exports=b("XController").create("\/apps\/{app_id}\/{?page}\/{?tab}\/{?id}\/",{app_id:{type:"Int",required:true},page:{type:"Enum",defaultValue:"dashboard",enumType:1},tab:{type:"String"},id:{type:"Int"},add_submittable_items:{type:"Bool",defaultValue:false}});},null);
__d("PluginConfigurator",["CSS","DOM","Event","SelectorDeprecated","URI","XDeveloperAppController","DeveloperAppPage","$","arrayContains","copyProperties","ge","getElementText"],function(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r){b.__markCompiled&&b.__markCompiled();var s=[];function t(){}p(t.prototype,{init:function(u,v){this.config=u;this.config.code_button=v;for(var w in this.config.params)this.config.params[w].value=this.config.params[w]['default'];var x=n(this.config.form_id),y=h.scry(x,'input[type="text"]'),z=h.scry(x,'input[type="checkbox"]'),aa=y.concat(z,h.scry(x,'textarea'));for(var ba in this.config.params){var ca=0;if(this.config.params[ba].type=='question'){var da='param_'+ba+'_link',ea=ba+'_link',fa=q(da);this.config.params[ea]={};this.config.params[ea].lastShownPollItem=1;this.config.params[ea].questionName=ba;for(var ga=0,ha=aa.length;ga<ha;ga++)if(aa[ga].name==ba+"poll"+ca){ca++;this.config.params[aa[ga].name]={};this.config.params[aa[ga].name].pollName=ba;this.config.params[aa[ga].name].type='poll';this.config.params[aa[ga].name].value=this.config.params[ba]['default'];}this.config.params[ba].questionsCount=ca-1;i.listen(fa,'click',this.handleAddLinkClick.bind(this));}}for(var ga=0,ha=aa.length;ga<ha;ga++){this.updateFormElement(aa[ga]);i.listen(aa[ga],'change',this.handleChange.bind(this));}for(ga=0;ga<s.length;ga++){var ia=s[ga];this.updateFormElement(ia);ia.subscribe('change',function(ja,event){this.updateFormElement(ja);if(this.getName(ja)!='pageselector')this.renderExample(true);}.bind(this,ia));}this.renderExample(false);},renderExample:function(u){var v='',w={},x=false,y=[],z;for(var aa in this.config.params){var ba=this.config.params[aa],ca=ba.value,da=ba['default'],ea=ba.example,fa=ba.always_set,ga=ba.type;if(ca===(void 0)&&ea!==(void 0))ca=ea;if(ba.xfbml_name)aa=ba.xfbml_name;if(ga=='question')z=aa;if(ga=='poll')y.push(ca);if(aa=='colorscheme'&&ca=='dark')x=true;if(ca!==(void 0)&&ca!==''&&ca!==null&&ga!='question'&&ga!='poll'&&(fa!=null||ca!=da||ca==ea)){aa='data-'+aa.replace(/_/g,'-');w[aa]=ca;}}if(y.length!==0)w[z]=JSON.stringify(y);v=h.create('div');for(var ha in w)if(w.hasOwnProperty(ha))v.setAttribute(ha,w[ha]);v.className=this.config.xfbml.replace(':','-');if(!this.config.example_id)return;var ia=n(this.config.example_id),ja=["fb:activity","fb:comments","fb:facepile","fb:follow","fb:like","fb:like-box","fb:recommendations"];if(o(ja,this.config.xfbml))g.conditionClass(ia,'dark_background',x);h.setContent(ia,v);if(u)a.FB.XFBML.parse(n(this.config.example_id));},handleAddLinkClick:function(event){var u=event.getTarget(),v=this.getName(u)||this.getName(u.parentNode),w=this.config.params[v].lastShownPollItem,x=this.config.params[v].questionName;w++;var y=q('param_'+x+w);if(y!=null){y.type="text";this.config.params[v].lastShownPollItem=w;var z=q('param_'+x+(w+1));if(z==null){u.parentNode.style.visibility='hidden';u.style.visibility='hidden';}}},handleChange:function(event){var u=event.getTarget();this.updateFormElement(u);this.renderExample(true);},getName:function(u){return u.name||u.getName()||u.getAttribute('data-name');},updateFormElement:function(u){var v=this.getName(u),w=this.config.params[v];if(v!==null&&w){if(w.type=='bool'){w.value=u.checked?'true':'false';}else if(w.type=='enum'){w.value=u.getValue();}else if(w.type=='pageselector'){var x=j.getValue(u);if(!!u.getAttribute('data-multiple')){x=x.filter(function(ba){return ba.length>0;});x=x.join(',');}w.value=x;}else if(u.value!=u.placeholder)w.value=u.value;var y=w.value;if(w.type=='poll'){y=this.handlePollValueChange(v);v=w.pollName;}var z={};z[v]=y;var aa=k(this.config.code_button.href);aa.addQueryData(z);this.config.code_button.href=aa.toString();}},handlePollValueChange:function(u){var v=this.config.params[u],w=v.pollName,x=[];for(var y=0;y<this.config.params[w].questionsCount;y++){var z=this.config.params[w+'poll'+y].value;if(z!=='')x.push(z);}return JSON.stringify(x);}});t.initSelect=function(u,v){var w=h.scry(u,'button');w.forEach(function(x){i.listen(x,'click',function(event){w.forEach(function(y){g.removeClass(y,'uiPillButtonSelected');});g.addClass(x,'uiPillButtonSelected');v.show(x.id.replace('button','snip'));});});};t.initAppChooser=function(u,v){u.subscribe('change',function(w){var x=u.getValue(),y=v[x];if(y){n('sandbox_warning_link').href=(l.getURIBuilder()).setEnum('page',m.REVIEW_STATUS).setInt('app_id',x).getURI();g.show(n('sandbox_warning'));}else g.hide(n('sandbox_warning'));['snip-html5','snip-xfbml','snip-iframe','snip-url'].forEach(function(z){var aa=h.scry(n(z),'textarea');if(aa.length>0)h.setContent(aa[0],r(aa[0]).replace(/appId=\d+/,'appId='+x));var ba=h.scry(n(z),'.uiSelector');if(ba.length>0)j.setSelected(ba[0],x);});});};t.registerSelector=function(u){s.push(u);};e.exports=t;},null);
__d("legacy:devsite-plugin-config",["PluginConfigurator"],function(a,b,c,d){b.__markCompiled&&b.__markCompiled();a.PluginConfigurator=b('PluginConfigurator');},3);
__d("ScrubberUpdateOnScroll",["DOM","DOMDimensions","Event","SubscriptionsHandler","Vector","ViewportBounds","getElementPosition","throttle"],function(a,b,c,d,e,f,g,h,i,j,k,l,m,n){b.__markCompiled&&b.__markCompiled();function o(p){"use strict";this._scrubber=p;this._scrollArea=this._scrubber.getScrollArea();this._listeners=new j();}o.prototype.enable=function(){"use strict";if(this._scrollArea){var p=g.find(this._scrollArea,'.uiScrollableAreaWrap');this._listeners.addSubscriptions(i.listen(p,'scroll',n(this._handleScroll,10,this)));}else this._listeners.addSubscriptions(i.listen(window,'scroll',n(this._handleScroll,10,this)),i.listen(window,'resize',n(this._handleResize,10,this)));this._updateThreshold();};o.prototype.disable=function(){"use strict";this._listeners.release();};o.prototype._handleScroll=function(event){"use strict";var p=this._scrubber.getTargets();if(!p.length)return;var q=p[0];for(var r=0;r<p.length;r++){var s=m(p[r].node).y,t=p[r].node.offsetHeight;if(t+s<=this._getTop()&&r!==p.length-1)continue;q=p[r];if(t<this._threshold||t+s>this._threshold)break;}this._scrubber.select(q.item);};o.prototype._getTop=function(){"use strict";if(this._scrollArea)return m(this._scrollArea).y;return l.getTop();};o.prototype._handleResize=function(){"use strict";this._updateThreshold();};o.prototype._updateThreshold=function(){"use strict";if(this._scrollArea){var p=this._scrubber.getScrollAreaJS();this._threshold=p?p.getScrollHeight()/5:k.getElementDimensions(this._scrollArea).y/5;}else this._threshold=h.getViewportDimensions().height/5;};e.exports=o;},null);