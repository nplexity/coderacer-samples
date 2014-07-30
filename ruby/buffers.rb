/*buffers.rb*/
/*Ruby*/
/*https://github.com/rails/rails/blob/master/actionview/lib/action_view/buffers.rb*/

class StreamingBuffer
  def initialize(block)
    @block = block
  end

  def <<(value)
    value = value.to_s
    value = ERB::Util.h(value) unless value.html_safe?
    @block.call(value)
  end
  alias :concat  :<<
  alias :append= :<<

  def safe_concat(value)
    @block.call(value.to_s)
  end
  alias :safe_append= :safe_concat

  def html_safe?
    true
  end

  def html_safe
    self
  end
end
