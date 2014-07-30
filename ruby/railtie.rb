/*railtie.rb*/
/*Ruby*/
/*https://github.com/rails/rails/blob/master/actionview/lib/action_view/railtie.rb*/

initializer "action_view.set_configs" do |app|
  ActiveSupport.on_load(:action_view) do
    app.config.action_view.each do |k,v|
      send "#{k}=", v
    end
  end
end

initializer "action_view.caching" do |app|
  ActiveSupport.on_load(:action_view) do
    if app.config.action_view.cache_template_loading.nil?
      ActionView::Resolver.caching = app.config.cache_classes
    end
  end
end
