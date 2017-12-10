import io.github.gitbucket.solidbase.model.Version
import gitbucket.codesearch.controllers.SearchController

class Plugin extends gitbucket.core.plugin.Plugin {
  override val pluginId: String = "codesearch"
  override val pluginName: String = "Code Search Plugin"
  override val description: String = "TODO"
  override val versions: List[Version] = List(new Version("1.0.0"))

  override val controllers = Seq(
    "/*" -> new SearchController()
  )
}
