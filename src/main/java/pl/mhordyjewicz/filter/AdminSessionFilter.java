package pl.mhordyjewicz.filter;

public class AdminSessionFilter /*extends OncePerRequestFilter*/
{

   /* private final Set<String> unsecuredPath = new HashSet<>(Arrays.asList("/", "/adminpanel/login"));

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException
    {
        String requestURI = request.getRequestURI();
        if (isSecured(requestURI))
        {
            UserDTO loggedUser = (UserDTO) request.getSession()
                    .getAttribute(LoginController.LOGGED_USER_KEY);
            if (loggedUser == null)
            {
                response.sendRedirect("/adminpanel/login");
                return;
            }
        }
        filterChain.doFilter(request, response);

    }

    private boolean isSecured(String requestURI)
    {
        return !unsecuredPath.contains(requestURI);
    }*/
}


