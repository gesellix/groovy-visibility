package groovy.visibility

class InheritableThreadLocalExample extends InheritableThreadLocal<Map<String, String>> {

  @Override
  protected Map<String, String> childValue(Map<String, String> parentValue) {
    return super.childValue(parentValue)
  }
}
