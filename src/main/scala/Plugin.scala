import io.github.gitbucket.solidbase.model.Version
import gitbucket.core.controller.Context
import gitbucket.core.plugin._
import gitbucket.core.service.RepositoryService.RepositoryInfo
import gitbucket.codesearch.controllers.CodeSearchController

class Plugin extends gitbucket.core.plugin.Plugin {
  override val pluginId: String = "codesearch"
  override val pluginName: String = "Code Search Plugin"
  override val description: String = "Instead of removed default code search."
  override val versions: List[Version] = List(new Version("1.0.0"))

  override val repositoryMenus = Seq(
    (repository: RepositoryInfo, context: Context) => Some(Link("Code search", "Code search", "/search?type=code&q=&type=files", Some("search")))
  )

  override val controllers = Seq(
    "/*" -> new CodeSearchController
  )
}
