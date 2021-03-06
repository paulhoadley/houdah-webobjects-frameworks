# houdah-webobjects-frameworks
Automatically exported from code.google.com/p/houdah-webobjects-frameworks

The frameworks make up a new major open source project to extend Apple's WebObjects application server. Granted the Houdah Frameworks can't compete in size with Project WONDER. Yet I am proud of what I achieved and believe I provide a viable alternative.

Most importantly though, you don't have to view Houdah Frameworks as competition to existing architecture like D2W or WONDER. You may view the Houdah Frameworks as a repository of utilities and useful code snippet which work with all WebObjects? applications. Actually some of the code has been available for download on my personal web site for quite some time now. The custom qualifiers (InSubqueryQualifier?, InSubSetQualifier?, ...) have proven to be popular. You are bound to find many like code nuggets in the low level frameworks: HoudahFoundation, HoudahEOControl, HoudahEOAccess or HoudahAppServer.

Of course, there is much more to the Houdah Frameworks. Like the rule based validation system which will, of course, work with just about any WebObjects? application. Or the rule engine, ... .

The real strength of the Houdah Frameworks is the web component architecture which builds up to a rule based CRUD framework. HoudahAgileComponents are meant as a modern alternative to D2W. The framework produces perfectly clean HTML which is to be "skinned" at the application level by CSS sheets. HoudahAgileComponents is very flexible and allows for easy customization and extension through both rules and code.

The architecture builds upon HoudahViewComponents which provides the view layer. This layer provides large grain view components build from fine grained cells. The view layer could work with any control or persistence layer. The HoudahControlComponents implements a control layer focused on creating CRUD applications using EOF. The control components could be used as is: one would have to subclass an abstract controller for each "page" of the application.

HoudahAgileComponents extends the control components by concrete subclasses which call into a rule system. This makes Houdah Frameworks a powerhouse for both rapid prototyping as well as production applications. That said, Houdah Frameworks are intended for use on in-house CRUD systems. If you were to create a public web site, you would need to work on optimization.

All throughout Houdah Frameworks MVC principles are taken to the extreme. Of course the EOControl layer does not depend on the EOAccess layer, the view layer does not depend on EOF and the control layer joins them.

BTW, I am pretty proud of the rule engine. It is based upon the same ideas as Apple's engine and retains file format compatibility. It has the distinct advantage of depending only on the Foundation and EOControl layers. It may thus be used in code that's unrelated to the WebObjects? presentation layer. I also believe that the caching algorithm is much superior to Apple's.

See the wiki branch for documentation.
