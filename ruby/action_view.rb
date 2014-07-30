/*action_view.rb*/
/*Ruby*/
/*https://github.com/rails/rails/blob/master/actionview/lib/action_view.rb*/

autoload_under "renderer" do
  autoload :Renderer
  autoload :AbstractRenderer
  autoload :PartialRenderer
  autoload :TemplateRenderer
  autoload :StreamingTemplateRenderer
end

autoload_at "action_view/template/resolver" do
  autoload :Resolver
  autoload :PathResolver
  autoload :OptimizedFileSystemResolver
  autoload :FallbackFileSystemResolver
end
